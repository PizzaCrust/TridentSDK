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

package net.tridentsdk.event.player;

import net.tridentsdk.entity.living.Player;
import net.tridentsdk.event.Cancellable;
import net.tridentsdk.inventory.Item;

/**
 * Occurs when a player drops an item out of their inventory, usually by default pressing 'q'
 *
 * @author The TridentSDK Team
 * @since 0.3-alpha-DP
 */
public class PlayerDropItemEvent extends PlayerEvent implements Cancellable {
    private final Item item;
    private boolean cancelled;

    public PlayerDropItemEvent(Player player, Item item) {
        super(player);
        this.item = item;
    }

    /**
     * @return return the dropped item
     */
    public Item item() {
        return this.item;
    }

    @Override
    public boolean isIgnored() {
        return cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
