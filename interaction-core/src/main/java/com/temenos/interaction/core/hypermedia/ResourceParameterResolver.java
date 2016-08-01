package com.temenos.interaction.core.hypermedia;

/*
 * #%L
 * interaction-core
 * %%
 * Copyright (C) 2012 - 2014 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */



/**
 * Implementations of this interface provide a way of resolving an aliases to resource parameters and values. There are
 * two main methods, first passing any objects to resolve and second where we also pass context with additional data.
 * Both method must be implemented, when context is not needed or null, then it just should call the first method
 *
 * @author mlambert
 *
 */
public interface ResourceParameterResolver {
	ParameterAndValue[] resolve(Object[] aliases);
	ParameterAndValue[] resolve(Object[] aliases, ResourceParameterResolverContext context);
}