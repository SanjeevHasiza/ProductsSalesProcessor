package com.javacircle.soa.utils;

import java.util.Collection;

import org.springframework.util.CollectionUtils;

public class CommonUtils {

	public static <E> boolean isNotEmpty(final Collection<E> collection) {
		return !CollectionUtils.isEmpty(collection);
	}

	public static boolean isNotEmpty(final String input) {
		return !org.springframework.util.StringUtils.isEmpty(input);
	}

}
