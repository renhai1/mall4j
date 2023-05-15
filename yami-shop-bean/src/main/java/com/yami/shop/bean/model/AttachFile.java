

package com.yami.shop.bean.model;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tz_attach_file")
public class AttachFile implements Serializable {
    @TableId

    private Long fileId;

    /**
     * 文件路径
     */

    private String filePath;

    /**
     * 文件类型
     */

    private String fileType;

    /**
     * 文件大小
     */

    private Integer fileSize;

    /**
     * 上传时间
     */

    private Date uploadTime;

    /**
     * 文件关联的表主键id
     */

    private Long fileJoinId;
    
    /**
     * 文件关联表类型：1 商品表  @see FileJoinType
     */

    private Integer fileJoinType;
}