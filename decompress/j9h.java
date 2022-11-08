import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9h extends e9s
{
    public static j9h c(final ByteBuffer byteBuffer) {
        final j9h j9h = new j9h();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        j9h.b(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return j9h;
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
