package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.ItemSet;
import com.ruoyi.system.service.IItemSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目集Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/item_set")
public class ItemSetController extends BaseController
{
    @Autowired
    private IItemSetService itemSetService;

    /**
     * 查询项目集列表
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:list')")
    @GetMapping("/list")
    public TableDataInfo list(ItemSet itemSet)
    {
        startPage();
        List<ItemSet> list = itemSetService.selectItemSetList(itemSet);
        return getDataTable(list);
    }

    /**
     * 导出项目集列表
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:export')")
    @Log(title = "项目集", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ItemSet itemSet)
    {
        List<ItemSet> list = itemSetService.selectItemSetList(itemSet);
        ExcelUtil<ItemSet> util = new ExcelUtil<ItemSet>(ItemSet.class);
        util.exportExcel(response, list, "项目集数据");
    }

    /**
     * 获取项目集详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:query')")
    @GetMapping(value = "/{itemSetId}")
    public AjaxResult getInfo(@PathVariable("itemSetId") Long itemSetId)
    {
        return success(itemSetService.selectItemSetByItemSetId(itemSetId));
    }

    /**
     * 新增项目集
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:add')")
    @Log(title = "项目集", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ItemSet itemSet)
    {
        return toAjax(itemSetService.insertItemSet(itemSet));
    }

    /**
     * 修改项目集
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:edit')")
    @Log(title = "项目集", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ItemSet itemSet)
    {
        return toAjax(itemSetService.updateItemSet(itemSet));
    }

    /**
     * 删除项目集
     */
    @PreAuthorize("@ss.hasPermi('system:item_set:remove')")
    @Log(title = "项目集", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemSetIds}")
    public AjaxResult remove(@PathVariable Long[] itemSetIds)
    {
        return toAjax(itemSetService.deleteItemSetByItemSetIds(itemSetIds));
    }
}
