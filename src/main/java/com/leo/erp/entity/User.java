package com.leo.erp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author SH
 * @since 2020-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态: 1启用 0禁用
     */
    private Long enabled;

    /**
     * 用户名 
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门ID 
     */
    private Long deptId;

    /**
     * 手机
     */
    private String phone;

    /**
     * 职务ID 
     */
    private Long jobId;

    /**
     * 创建日期 
     */
    private Timestamp createTime;

    /**
     * 最后密码修改日期 
     */
    private Timestamp lastPasswordResetTime;


}
