package com.xw.xwojcodesandbox;


import com.xw.xwojcodesandbox.model.ExecuteCodeRequest;
import com.xw.xwojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
