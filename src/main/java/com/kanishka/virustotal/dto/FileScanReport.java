/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kanishka.virustotal.dto;

import java.util.HashMap;

/**
 *
 * @author kdkanishka@gmail.com
 */
public class FileScanReport {

    private HashMap<String, VirusScanInfo> scans;
    private String scan_id;
    private String sha1;
    private String resource;
    private Integer response_code;
    private String scan_date;
    private String permalink;
    private String verbose_msg;
    private Integer total;
    private Integer positives;
    private String sha256;
    private String md5;

    public FileScanReport() {
    }

    public HashMap<String, VirusScanInfo> getScans() {
        return scans;
    }

    public void setScans(HashMap<String, VirusScanInfo> scans) {
        this.scans = scans;
    }

    public String getScan_id() {
        return scan_id;
    }

    public void setScan_id(String scan_id) {
        this.scan_id = scan_id;
    }

    /**
     *
     * @return SHA1 hash value for the resource
     */
    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * Returns uniquely identifiable ID for the resource
     *
     * @return uniquely identifiable ID for the resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Retuns response code for the requested resource
     *
     * @return 1 if results are available for the requested resource otherwise
     * it will return 0
     */
    public Integer getResponse_code() {
        return response_code;
    }

    public void setResponse_code(Integer response_code) {
        this.response_code = response_code;
    }

    /**
     *
     * @return scanned date time
     */
    public String getScan_date() {
        return scan_date;
    }

    public void setScan_date(String scan_date) {
        this.scan_date = scan_date;
    }

    /**
     *
     * @return permalink for the resource
     */
    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     *
     * @return verbose message for the resource
     */
    public String getVerbose_msg() {
        return verbose_msg;
    }

    public void setVerbose_msg(String verbose_msg) {
        this.verbose_msg = verbose_msg;
    }

    /**
     *
     * @return total number of scanners
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     *
     * @return number of positives
     */
    public Integer getPositives() {
        return positives;
    }

    public void setPositives(Integer positives) {
        this.positives = positives;
    }

    /**
     *
     * @return SHA256 hash for the resource
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    /**
     *
     * @return MD5 Hash for the resource
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
