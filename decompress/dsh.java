import java.lang.reflect.InvocationTargetException;
import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsh implements g9d
{
    public final int a;
    public final g9d b;
    public final Integer c;
    public final boolean d;
    
    public dsh(final int a, final g9d b, final Integer c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final f9d a(final f7d ex, final boolean b) {
        final int a = this.a;
        final boolean d = this.d;
        try {
            final Class<Integer> type = Integer.TYPE;
            final Class<Boolean> type2 = Boolean.TYPE;
            return ((g9d)NativeJpegTranscoderFactory.class.getConstructor(type, type2, type2).newInstance(a, Boolean.FALSE, d)).createImageTranscoder((f7d)ex, b);
        }
        catch (final ClassNotFoundException ex) {}
        catch (final IllegalArgumentException ex) {}
        catch (final IllegalAccessException ex) {}
        catch (final InvocationTargetException ex) {}
        catch (final InstantiationException ex) {}
        catch (final SecurityException ex) {}
        catch (final NoSuchMethodException ex2) {}
        throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", ex);
    }
    
    public final f9d createImageTranscoder(final f7d f7d, final boolean b) {
        final g9d b2 = this.b;
        final f9d f9d = null;
        f9d imageTranscoder;
        if (b2 == null) {
            imageTranscoder = null;
        }
        else {
            imageTranscoder = b2.createImageTranscoder(f7d, b);
        }
        Object a = imageTranscoder;
        if (imageTranscoder == null) {
            final Integer c = this.c;
            if (c == null) {
                a = f9d;
            }
            else {
                final int intValue = c;
                if (intValue != 0) {
                    if (intValue != 1) {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                    a = new g8q(b, this.a);
                }
                else {
                    a = this.a(f7d, b);
                }
            }
        }
        f9d a2;
        if ((a2 = (f9d)a) == null) {
            a2 = (f9d)a;
            if (rqu.D0) {
                a2 = this.a(f7d, b);
            }
        }
        Object o;
        if ((o = a2) == null) {
            o = new g8q(b, this.a);
        }
        return (f9d)o;
    }
}
