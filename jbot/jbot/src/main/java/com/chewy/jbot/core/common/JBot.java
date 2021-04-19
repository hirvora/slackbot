package com.chewy.jbot.core.common;

import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

/**
 *  @author Hirav Oza
 * @Created date  04/15/2021
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
public @interface JBot {

    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     *
     * @return the suggested component name, if any
     */
    String value() default "";

}
