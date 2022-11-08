import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public interface v3h
{
    int C(final int p0, final byte[] p1, final int p2, final int p3);
    
    ByteBuffer D();
    
    byte O(final int p0);
    
    long U() throws UnsupportedOperationException;
    
    long W();
    
    int Z(final int p0, final byte[] p1, final int p2, final int p3);
    
    void close();
    
    int getSize();
    
    void i0(final v3h p0, final int p1);
    
    boolean isClosed();
}
