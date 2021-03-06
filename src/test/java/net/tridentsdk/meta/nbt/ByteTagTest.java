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

package net.tridentsdk.meta.nbt;

import org.junit.Assert;
import org.junit.Test;

public class ByteTagTest {

    @Test
    public void testSetValue() throws Exception {
        ByteTag tag = new ByteTag("tag");
        Assert.assertEquals(tag.value(), 0);

        tag.setValue((byte) 5);
        Assert.assertEquals(tag.value(), 5);
    }

    @Test
    public void testGetType() throws Exception {
        ByteTag tag = new ByteTag("tag");
        Assert.assertEquals(tag.type(), TagType.BYTE);
    }
}