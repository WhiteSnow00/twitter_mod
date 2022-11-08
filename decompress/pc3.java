import android.annotation.SuppressLint;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pc3
{
    public static final alp<pc3> d;
    public final int a;
    public final int b;
    public final hoj c;
    
    static {
        pc3.d = new pc3.pc3$b();
    }
    
    public pc3(final a a) {
        this.a = a.a;
        this.b = a.b;
        final hoj c = a.c;
        pf8.r(c);
        this.c = c;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        tfe.T("camera_position", this.a);
        tfe.T("flash_mode", this.b);
        tfe.T("orientation", this.c.C0);
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && pc3.class == o.getClass()) {
            final pc3 pc3 = (pc3)o;
            if (this.a != pc3.a || this.b != pc3.b || this.c != pc3.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends h4j<pc3>
    {
        public int a;
        public int b;
        @SuppressLint({ "NullableEnum" })
        public hoj c;
        
        public final Object i() {
            return new pc3(this);
        }
        
        public final boolean l() {
            return this.a != 0 && this.b != 0 && this.c != null;
        }
    }
}
