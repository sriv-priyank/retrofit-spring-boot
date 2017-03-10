package com.techtraversal.springboot.retrofit.annotation;

import com.techtraversal.springboot.retrofit.autoconfigure.RetrofitClientsRegistrar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * Indicates that the annotated interface is a Retrofit client interface.
 * Note: Works for interfaces only and classes with this annotation are skipped
 * during bean registration by
 * {@link RetrofitClientsRegistrar.RetrofitClientsComponentScanner}
 * <p>
 * Also serves as a specialization of {@link Component @Component}, allowing for
 * implementation classes generated by Retrofit to be auto-detected through
 * classpath scanning.
 *
 * @author PriyankS
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RetrofitClient {

}