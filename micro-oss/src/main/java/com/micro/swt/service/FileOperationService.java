package com.micro.swt.service;

import com.micro.swt.exception.BusinessException;
import com.micro.swt.model.FileInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface FileOperationService {
    List<FileInfo> upload(HttpServletRequest request);

    void download(Long id, HttpServletResponse response) throws BusinessException, IOException;
}
