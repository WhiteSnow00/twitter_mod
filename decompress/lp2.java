import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lp2 implements am6
{
    @Override
    public final cm6 a(final InputStream inputStream, final boolean b) {
        return (cm6)new a(inputStream);
    }
    
    @Override
    public final String b() {
        return "br";
    }
    
    public static final class a implements cm6
    {
        public final InputStream a;
        
        public a(final InputStream a) {
            this.a = a;
        }
        
        public final void a() {
        }
        
        public final InputStream b() throws IOException {
            return (InputStream)new mp2(this.a);
        }
    }
}
