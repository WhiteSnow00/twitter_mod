import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.io.SequenceInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbc implements am6
{
    @Override
    public final cm6 a(final InputStream inputStream, final boolean b) {
        return (cm6)new a(inputStream, b);
    }
    
    @Override
    public final String b() {
        return "gzip";
    }
    
    public static final class a implements cm6
    {
        public final InputStream a;
        public final boolean b;
        
        public a(final InputStream a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public final void a() {
        }
        
        public final InputStream b() throws IOException {
            final byte[] array = new byte[14];
            final SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(array, 0, this.a.read(array)), this.a);
            Object o;
            if (this.b) {
                o = new ikr((InputStream)sequenceInputStream);
            }
            else {
                o = new GZIPInputStream(sequenceInputStream);
            }
            return (InputStream)o;
        }
    }
}
