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

package net.tridentsdk.event.block;

import net.tridentsdk.base.Block;
import net.tridentsdk.event.Cancellable;

/**
 * Called when a Bed explodes
 *
 * @author The TridentSDK Team
 * @since 0.3-alpha-DP
 */
public class BedExplodeEvent extends BlockEvent implements Cancellable {
    private float strength;
    private boolean cancelled;

    /**
     * @param block    Block associated with this event
     * @param strength Strength of the explosion
     */
    public BedExplodeEvent(Block block, float strength) {
        super(block);
        this.strength = strength;
    }

    @Override
    public boolean isIgnored() {
        return cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Get the strength of the explosion
     *
     * @return Float strength of explosion
     */
    public float strength() {
        return this.strength;
    }

    /**
     * Set the strength of the explosion
     *
     * @param strength Float strength of explosion
     */
    public void setStrength(float strength) {
        this.strength = strength;
    }
}
