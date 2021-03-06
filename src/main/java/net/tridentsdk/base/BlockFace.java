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
package net.tridentsdk.base;

import net.tridentsdk.util.Vector;

/**
 * TODO Write Description
 *
 * @author The TridentSDK Team
 * @since 0.4-alpha
 */
public enum BlockFace {

    DOWN((byte) 0, new Vector(0, -1, 0)),
    UP((byte) 1, new Vector(0, 1, 0)),
    NORTH((byte) 2, new Vector(0, 0, -1)),
    SOUTH((byte) 3, new Vector(0, 0, 1)),
    WEST((byte) 4, new Vector(-1, 0, 0)),
    EAST((byte) 5, new Vector(1, 0, 0));

    private byte direction;
    private Vector relative;

    BlockFace(byte direction, Vector relative){
        this.direction = direction;
        this.relative = relative;
    }

    public BlockFace getOpposite(){
        switch(this){
            case DOWN:
                return UP;
            case UP:
                return DOWN;
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case WEST:
                return EAST;
            default:
                return WEST;
        }
    }

    public int direction(){
        return direction;
    }

    public Vector relative(){
        return relative;
    }

    public static BlockFace directionToFace(byte direction){
        switch(direction){
            case 0:
                return DOWN;
            case 1:
                return UP;
            case 2:
                return NORTH;
            case 3:
                return SOUTH;
            case 4:
                return WEST;
            default:
                return EAST;
        }
    }

}
