package pers.lzy.template.excel.spring.boot.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import pers.lzy.template.excel.core.TemplateExcelFiller;
import pers.lzy.template.excel.core.TemplateExcelFillerFactory;

/**
 * @author immort-liuzyj(zyliu)
 * @since 2022/8/20  20:39
 */
@ConditionalOnProperty(prefix = ZyTemplateExcelPropertiesKeyConstant.CONFIG_FILE_ITEM_PREFIX, value = "enable", matchIfMissing = true)
@ConditionalOnClass(TemplateExcelFiller.class)
@EnableConfigurationProperties({ZyTemplateExcelProperties.class})
public class ZyTemplateExcelAutoConfiguration {

    private final ZyTemplateExcelProperties zyTemplateExcelProperties;

    public ZyTemplateExcelAutoConfiguration(ZyTemplateExcelProperties zyTemplateExcelProperties) {
        this.zyTemplateExcelProperties = zyTemplateExcelProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public TemplateExcelFiller templateExcelFiller() {
        return TemplateExcelFillerFactory.defaultTemplateExcelFillerBuilder()
                .expressionCacheSize(zyTemplateExcelProperties.getExpressionCacheSize())
                .build();
    }
}
