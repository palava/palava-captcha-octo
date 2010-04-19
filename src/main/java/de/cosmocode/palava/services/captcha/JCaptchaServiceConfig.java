/**
 * palava - a java-php-bridge
 * Copyright (C) 2007-2010  CosmoCode GmbH
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package de.cosmocode.palava.services.captcha;

import de.cosmocode.palava.captcha.CaptchaServiceConfig;

/**
 * Static constant holder class for jcaptcha config key names.
 *
 * @author Willi Schoenborn
 */
public final class JCaptchaServiceConfig {

    public static final String PREFIX = CaptchaServiceConfig.PREFIX;
    
    public static final String AMPLITUDE = PREFIX + "amplitude";
    
    public static final String ANTIALIAS = PREFIX + "antialias";
    
    public static final String PHASE = PREFIX + "phase";
    
    public static final String WAVELENGTH = PREFIX + "wavelength";
    
    public static final String WIDTH = PREFIX + "width";
    
    public static final String HEIGHT = PREFIX + "height";
    
    public static final String FONT_MIN_HEIGHT = PREFIX + "fontMinHeight";
    
    public static final String FONT_MAX_HEIGHT = PREFIX + "fontMaxHeight";
    
    public static final String NUMBER_OF_HOLES = PREFIX + "numberOfHoles";
    
    private JCaptchaServiceConfig() {
        
    }

}
