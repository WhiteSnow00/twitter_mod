// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.google.android.filament.proguard.UsedByNative;

@UsedByNative("NioUtils.cpp")
final class NioUtils
{
    private NioUtils() {
    }
    
    @UsedByNative("NioUtils.cpp")
    public static Object getBaseArray(final Buffer buffer) {
        Object array;
        if (buffer.hasArray()) {
            array = buffer.array();
        }
        else {
            array = null;
        }
        return array;
    }
    
    @UsedByNative("NioUtils.cpp")
    public static int getBaseArrayOffset(final Buffer buffer, int n) {
        if (buffer.hasArray()) {
            n = buffer.position() + buffer.arrayOffset() << n;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    @UsedByNative("NioUtils.cpp")
    public static long getBasePointer(final Buffer buffer, final long n, final int n2) {
        long n3 = 0L;
        if (n != 0L) {
            n3 = (buffer.position() << n2) + n;
        }
        return n3;
    }
    
    @UsedByNative("NioUtils.cpp")
    public static int getBufferType(final Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return BufferType.BYTE.ordinal();
        }
        if (buffer instanceof CharBuffer) {
            return BufferType.CHAR.ordinal();
        }
        if (buffer instanceof ShortBuffer) {
            return BufferType.SHORT.ordinal();
        }
        if (buffer instanceof IntBuffer) {
            return BufferType.INT.ordinal();
        }
        if (buffer instanceof LongBuffer) {
            return BufferType.LONG.ordinal();
        }
        if (buffer instanceof FloatBuffer) {
            return BufferType.FLOAT.ordinal();
        }
        return BufferType.DOUBLE.ordinal();
    }
    
    public enum BufferType
    {
        BYTE, 
        CHAR, 
        DOUBLE, 
        FLOAT, 
        INT, 
        LONG, 
        SHORT;
    }
}
