/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.world;

import net.tridentsdk.base.Position;

/**
 * Access to the world border properties
 *
 * @author The TridentSDK Team
 * @since 0.4-alpha
 */
public interface WorldBorder {
    /**
     * Gets the size of the worldborder
     *
     * @return The size of the worldborder
     */
    double borderSize();

    /**
     * Gets the location where the worldborder is centered
     *
     * @return The location where the worldborder is centered
     */
    Position borderCenter();

    /**
     * Gets to what size a border is contracting, 60000000 by default
     *
     * @return To what size a border is contracting, 60000000 by default
     */
    int borderSizeContraction();

    /**
     * Gets the time the border has to contract to the contraction target
     *
     * @return The time the border has to contract to the contraction target
     */
    int borderSizeContractionTime();
}
