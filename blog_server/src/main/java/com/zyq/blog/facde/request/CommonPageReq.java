package com.zyq.blog.facde.request;

import lombok.Data;

@Data
public class CommonPageReq {

    private Integer pageSize;
    private Integer pageNum;
    private String sortOrderBy;

}
