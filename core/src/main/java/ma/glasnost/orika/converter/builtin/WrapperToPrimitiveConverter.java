/*
 * Orika - simpler, better and faster Java bean mapping
 *
 * Copyright (C) 2011-2013 Orika authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ma.glasnost.orika.converter.builtin;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

/**
 * Provides wrapper to primitives conversion
 * 
 * @author elaatifi@gmail.com
 * @author matt.deboer@gmail.com
 *
 */
public class WrapperToPrimitiveConverter extends CustomConverter<Object, Object> {
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * ma.glasnost.orika.CustomConverter#canConvert(ma.glasnost.orika.metadata
     * .Type, ma.glasnost.orika.metadata.Type)
     */
    public boolean canConvert(Type<?> sourceType, Type<?> destinationType) {
        return sourceType.isWrapperFor(destinationType);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see ma.glasnost.orika.Converter#convert(java.lang.Object,
     * ma.glasnost.orika.metadata.Type)
     */
    public Object convert(Object source, Type<?> destinationType, MappingContext context) {
        
        if (Character.TYPE == destinationType.getRawType()) {
            return (Character) source;
        } else if (Byte.TYPE == destinationType.getRawType()) {
            return (Byte) source;
        } else if (Short.TYPE == destinationType.getRawType()) {
            return (Short) source;
        } else if (Integer.TYPE == destinationType.getRawType()) {
            return (Integer) source;
        } else if (Long.TYPE == destinationType.getRawType()) {
            return (Long) source;
        } else if (Float.TYPE == destinationType.getRawType()) {
            return (Float) source;
        } else if (Double.TYPE == destinationType.getRawType()) {
            return (Double) source;
        } else if (Boolean.TYPE == destinationType.getRawType()) {
            return (Boolean) source;
        }
        return null;
    }
    
}
