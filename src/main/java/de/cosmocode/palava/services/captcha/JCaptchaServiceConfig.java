/**
 * Copyright 2010 CosmoCode GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
