package pers.lzy.template.excel.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author immort-liuzyj(zyliu)
 * @since 2022/8/20  20:44
 */
@ConfigurationProperties(prefix = ZyTemplateExcelPropertiesKeyConstant.CONFIG_FILE_ITEM_PREFIX)
public class ZyTemplateExcelProperties {

    /**
     * Size of the expression cache.
     * If the value is smaller than 100, the system automatically changes the value to 1000.
     * The default value is 500.
     */
    private int expressionCacheSize = 500;

    public int getExpressionCacheSize() {
        return expressionCacheSize;
    }

    public void setExpressionCacheSize(int expressionCacheSize) {
        this.expressionCacheSize = expressionCacheSize;
    }
}
