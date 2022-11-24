import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class km8 implements am6
{
    @Override
    public final cm6 a(final InputStream inputStream, final boolean b) {
        return (cm6)new a(inputStream);
    }
    
    @Override
    public final String b() {
        return "deflate";
    }
    
    public static final class a implements cm6
    {
        public final InputStream a;
        
        public a(final InputStream a) {
            this.a = a;
        }
        
        public final void a() {
        }
        
        public final InputStream b() {
            return new InflaterInputStream(this.a, new Inflater(false));
        }
    }
}
