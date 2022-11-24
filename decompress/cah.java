import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cah extends ras
{
    public static cah c(final ByteBuffer byteBuffer) {
        final cah cah = new cah();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        cah.b(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return cah;
    }
    
    public final int d() {
        final int a = this.a(6);
        int int1;
        if (a != 0) {
            final int n = a + super.a;
            int1 = super.b.getInt(super.b.getInt(n) + n);
        }
        else {
            int1 = 0;
        }
        return int1;
    }
}
