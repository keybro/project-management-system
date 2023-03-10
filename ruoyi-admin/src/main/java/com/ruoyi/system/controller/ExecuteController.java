package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Execute;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 执行列表Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/execute")
public class ExecuteController extends BaseController
{
    @Autowired
    private IExecuteService executeService;

    @Autowired
    private ISysUserService userService;

    @Autowired
    private IItemService  itemService;

    @Autowired
    private IProductPlanService productPlanService;

    @Autowired
    private IProductRequirementService requirementService;




    /**
     * 查询执行列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:execute:list')")
    @GetMapping("/list")
    public TableDataInfo list(Execute execute)
    {
        startPage();
        List<Execute> list = executeService.selectExecuteList(execute);
        for (Execute temp :
                list) {
            temp.setProductPrincipalName(userService.selectUserById(temp.getProductPrincipalId()).getNickName());
            temp.setTestPrincipalName(userService.selectUserById(temp.getTestPrincipalId()).getNickName());
            temp.setIterationPrincipalName(userService.selectUserById(temp.getIterationPrincipalId()).getNickName());
            temp.setItemName(itemService.selectItemByItemId(temp.getItemId()).getItemName());
            temp.setProductRequirementName(requirementService.selectProductRequirementByProductRequirementId((long) temp.getRelateRequireId()).getRequirementName());
        }
        return getDataTable(list);
    }

    /**
     * 导出执行列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:execute:export')")
    @Log(title = "执行列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Execute execute)
    {
        List<Execute> list = executeService.selectExecuteList(execute);
        ExcelUtil<Execute> util = new ExcelUtil<Execute>(Execute.class);
        util.exportExcel(response, list, "执行列表数据");
    }

    /**
     * 获取执行列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:execute:query')")
    @GetMapping(value = "/{executeId}")
    public AjaxResult getInfo(@PathVariable("executeId") Long executeId)
    {
        return success(executeService.selectExecuteByExecuteId(executeId));
    }

    /**
     * 新增执行列表
     */
    @PreAuthorize("@ss.hasPermi('system:execute:add')")
    @Log(title = "执行列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Execute execute)
    {
        return toAjax(executeService.insertExecute(execute));
    }

    /**
     * 修改执行列表
     */
    @PreAuthorize("@ss.hasPermi('system:execute:edit')")
    @Log(title = "执行列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Execute execute)
    {
        return toAjax(executeService.updateExecute(execute));
    }

    /**
     * 删除执行列表
     */
    @PreAuthorize("@ss.hasPermi('system:execute:remove')")
    @Log(title = "执行列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{executeIds}")
    public AjaxResult remove(@PathVariable Long[] executeIds)
    {
        return toAjax(executeService.deleteExecuteByExecuteIds(executeIds));
    }
}
