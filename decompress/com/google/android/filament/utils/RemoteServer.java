// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class RemoteServer
{
    private long mNativeObject;
    
    public RemoteServer(final int n) {
        final long nCreate = nCreate(n);
        this.mNativeObject = nCreate;
        if (nCreate != 0L) {
            return;
        }
        throw new IllegalStateException("Couldn't create RemoteServer");
    }
    
    public static boolean isBinary(final String s) {
        return s != null && !s.endsWith(".json");
    }
    
    public static boolean isJson(final String s) {
        return s != null && s.endsWith(".json");
    }
    
    private static native void nAcquireReceivedMessage(final long p0, final ByteBuffer p1, final int p2);
    
    private static native long nCreate(final int p0);
    
    private static native void nDestroy(final long p0);
    
    private static native String nPeekIncomingLabel(final long p0);
    
    private static native int nPeekReceivedBufferLength(final long p0);
    
    private static native String nPeekReceivedLabel(final long p0);
    
    public ReceivedMessage acquireReceivedMessage() {
        final int nPeekReceivedBufferLength = nPeekReceivedBufferLength(this.mNativeObject);
        if (nPeekReceivedBufferLength == 0) {
            return null;
        }
        final ReceivedMessage receivedMessage = new ReceivedMessage();
        receivedMessage.label = nPeekReceivedLabel(this.mNativeObject);
        (receivedMessage.buffer = ByteBuffer.allocateDirect(nPeekReceivedBufferLength)).order(ByteOrder.LITTLE_ENDIAN);
        nAcquireReceivedMessage(this.mNativeObject, receivedMessage.buffer, nPeekReceivedBufferLength);
        return receivedMessage;
    }
    
    public void close() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }
    
    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }
    
    public String peekIncomingLabel() {
        return nPeekIncomingLabel(this.mNativeObject);
    }
    
    public static class ReceivedMessage
    {
        public ByteBuffer buffer;
        public String label;
    }
}
