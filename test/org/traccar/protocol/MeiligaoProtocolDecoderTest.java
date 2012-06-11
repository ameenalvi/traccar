package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MeiligaoProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoProtocolDecoder decoder = new MeiligaoProtocolDecoder(new TestDataManager(), 0);
        ChannelBufferFactory factory = new HeapChannelBufferFactory();

        byte[] buf1 = {0x12,0x34,0x56,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,0x50,0x00,(byte)0x8B,(byte)0x9B,0x0D,0x0A};
        assertNull(decoder.decode(null, null, factory.getBuffer(buf1, 0, buf1.length)));

        byte[] buf2 = {0x12,0x34,0x56,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0x99,0x55,0x30,0x33,0x35,0x36,0x34,0x34,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x32,0x32,0x33,0x32,0x2E,0x36,0x30,0x38,0x33,0x2C,0x4E,0x2C,0x31,0x31,0x34,0x30,0x34,0x2E,0x38,0x31,0x33,0x37,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x2C,0x30,0x31,0x30,0x38,0x30,0x39,0x2C,0x2C,0x2A,0x31,0x43,0x7C,0x31,0x31,0x2E,0x35,0x7C,0x31,0x39,0x34,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x69,0x62,0x0D,0x0A};
        assertNotNull(decoder.decode(null, null, factory.getBuffer(buf2, 0, buf2.length)));

    }

}
