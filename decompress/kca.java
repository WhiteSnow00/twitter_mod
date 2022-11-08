import java.util.Arrays;
import java.util.Objects;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kca extends fb
{
    public final x8h m0(final h9h h9h, final ByteBuffer byteBuffer) {
        return new x8h(new x8h$b[] { (x8h$b)this.t0(new mwj(byteBuffer.array(), byteBuffer.limit())) });
    }
    
    public final jca t0(final mwj mwj) {
        final String n = mwj.n();
        Objects.requireNonNull(n);
        final String n2 = mwj.n();
        Objects.requireNonNull(n2);
        return new jca(n, n2, mwj.m(), mwj.m(), Arrays.copyOfRange(mwj.a, mwj.b, mwj.c));
    }
}
