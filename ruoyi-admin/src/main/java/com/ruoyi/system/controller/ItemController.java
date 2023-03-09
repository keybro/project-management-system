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
import com.ruoyi.system.domain.Item;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目列表Controller
 * 
 * @author lrj
 * @date 2023-03-08
 */
@RestController
@RequestMapping("/system/item")
public class ItemController extends BaseController
{
    @Autowired
    private IItemService itemService;

    @Autowired
    private IItemSetService iItemSetService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IProductPlanService productPlanService;

    @Autowired
    private ISysUserService userService;

    /**
     * 查询项目列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(Item item)
    {
        startPage();
        List<Item> list = itemService.selectItemList(item);
        for (Item temp:
                list) {
            temp.setPrincipalName(userService.selectUserById(temp.getPrincipalId()).getNickName());
            temp.setItemSetName(iItemSetService.selectItemSetByItemSetId(temp.getItemSetId()).getItemSetName());
            temp.setRelatedProductName(productService.selectProductByProductId(temp.getRelatedProductId()).getProductName());
            temp.setRelatedPlanName(productPlanService.selectProductPlanByPanId(temp.getRelatedPlanId()).getPlanName());
        }
        return getDataTable(list);
    }

    /**
     * 导出项目列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:export')")
    @Log(title = "项目列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Item item)
    {
        List<Item> list = itemService.selectItemList(item);
        ExcelUtil<Item> util = new ExcelUtil<Item>(Item.class);
        util.exportExcel(response, list, "项目列表数据");
    }

    /**
     * 获取项目列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:item:query')")
    @GetMapping(value = "/{itemId}")
    public AjaxResult getInfo(@PathVariable("itemId") Long itemId)
    {
        return success(itemService.selectItemByItemId(itemId));
    }

    /**
     * 新增项目列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:add')")
    @Log(title = "项目列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Item item)
    {
        return toAjax(itemService.insertItem(item));
    }

    /**
     * 修改项目列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:edit')")
    @Log(title = "项目列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Item item)
    {
        return toAjax(itemService.updateItem(item));
    }

    /**
     * 删除项目列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:remove')")
    @Log(title = "项目列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemIds}")
    public AjaxResult remove(@PathVariable Long[] itemIds)
    {
        return toAjax(itemService.deleteItemByItemIds(itemIds));
    }
}
