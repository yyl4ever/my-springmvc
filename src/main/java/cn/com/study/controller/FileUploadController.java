package cn.com.study.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @Author: yangyl
 * @Date: 2019/11/3 19:22
 */
@Controller
public class FileUploadController {
    
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        // 使用 fileUpload 组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        // 判断该路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            // 创建该文件夹
            file.mkdirs();
        }

        // 解析 request 对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            // 判断是否是上传文件项
            if (item.isFormField()) {
                // 普通表单项
            } else {
                // 上传文件项
                String fileName = item.getName();
                // 将文件名称设置为唯一
                String uuid = UUID.randomUUID().toString().replace("-", "");
                fileName = uuid + "_" + fileName;
                // 完成文件上传
                item.write(new File(path, fileName));
                // 删除临时文件 TODO
                item.delete();
            }
        }

        return "success";

    }

    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        // 使用 SpringMVC 框架完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        // 判断该路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            // 创建该文件夹
            file.mkdirs();
        }

        // 获取上传文件的名称
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;
        
        // 完成文件的上传
        upload.transferTo(new File(path, fileName));
        return "success";

    }

    /**
     * 跨服务器文件上传
     * @param upload
     * @return
     * @throws Exception
     */
    @RequestMapping("/fileUpload3")
    public String fileUpload3(MultipartFile upload) throws Exception {
        
        // 定义上传文件的路径
        String path = "http://localhost:8987/single-web-module/uploads/";
        // 获取上传文件的名称
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;

        // 创建客户端对象
        Client client = Client.create();
        
        // 和图片服务器建立连接
        WebResource resource = client.resource(path + fileName);
        // https://www.cnblogs.com/STK0210/p/11216404.html
        resource.put(upload.getBytes());
        return "success";

    }
}
