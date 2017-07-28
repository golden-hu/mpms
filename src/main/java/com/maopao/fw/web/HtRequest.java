package com.maopao.fw.web;

import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by hugo on 2017/6/22.
 */
public class HtRequest {
    @SuppressWarnings({ "rawtypes" })
    private List data = new ArrayList();
    private Collection<MultipartFile> fileItems;
    @SuppressWarnings({ "rawtypes" })
    public List getData() {
        return data;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void setData(List serviceData) {
        this.data.addAll(serviceData);
    }
    public void setFileItems(Collection<MultipartFile> fileItems) {
        this.fileItems = fileItems;
    }
    public Collection<MultipartFile> getFileItems() {
        return fileItems;
    }
}
