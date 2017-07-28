package com.maopao.util;

import com.maopao.fw.util.ConstUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * Created by hugo on 2017/6/22.
 */
public class ConfigUtil implements ServletContextAware {

    private String contextPath;
    private String dataDir;
    private String initDataDir;
    private String templateDir;
    private String attachDir;
    private String tempDir;
    private String exportDir;
    private String mailSender;
    private String faxSender;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getDataDir() {
        return dataDir;
    }

    public void setDataDir(String dataDir) {
        this.dataDir = dataDir;
    }

    public String getInitDataDir() {
        return initDataDir;
    }

    public void setInitDataDir(String initDataDir) {
        this.initDataDir = initDataDir;
    }

    public String getTemplateDir() {
        return templateDir;
    }

    public void setTemplateDir(String templateDir) {
        this.templateDir = templateDir;
    }

    public String getAttachDir() {
        return attachDir;
    }

    public void setAttachDir(String attachDir) {
        this.attachDir = attachDir;
    }

    public String getTempDir() {
        return tempDir;
    }

    public void setTempDir(String tempDir) {
        this.tempDir = tempDir;
    }

    public String getExportDir() {
        return exportDir;
    }

    public void setExportDir(String exportDir) {
        this.exportDir = exportDir;
    }

    public String getMailSender() {
        return mailSender;
    }

    public void setMailSender(String mailSender) {
        this.mailSender = mailSender;
    }

    public String getFaxSender() {
        return faxSender;
    }

    public void setFaxSender(String faxSender) {
        this.faxSender = faxSender;
    }

    public String getRealExportDir() {
        return contextPath + ConstUtil.DIR_SEP + getExportDir();
    }


    @Override
    public void setServletContext(ServletContext servletContext) {
        contextPath= servletContext.getRealPath("/");
    }
}
