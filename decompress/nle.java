import java.util.Iterator;
import com.google.firebase.encoders.EncodingException;
import java.util.Collection;
import android.util.Base64;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import android.util.JsonWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nle implements c5j, epw
{
    public boolean a;
    public final JsonWriter b;
    public final Map<Class<?>, b5j<?>> c;
    public final Map<Class<?>, dpw<?>> d;
    public final b5j<Object> e;
    public final boolean f;
    
    public nle(final Writer writer, final Map<Class<?>, b5j<?>> c, final Map<Class<?>, dpw<?>> d, final b5j<Object> e, final boolean f) {
        this.a = true;
        this.b = new JsonWriter(writer);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final c5j a(final lxa lxa, final Object o) throws IOException {
        return this.h(lxa.a, o);
    }
    
    public final epw b(final String s) throws IOException {
        this.i();
        this.b.value(s);
        return (epw)this;
    }
    
    public final epw c(final boolean b) throws IOException {
        this.i();
        this.b.value(b);
        return (epw)this;
    }
    
    @Override
    public final c5j d(final lxa lxa, final boolean b) throws IOException {
        final String a = lxa.a;
        this.i();
        this.b.name(a);
        this.i();
        this.b.value(b);
        return this;
    }
    
    @Override
    public final c5j e(final lxa lxa, final int n) throws IOException {
        final String a = lxa.a;
        this.i();
        this.b.name(a);
        this.i();
        this.b.value((long)n);
        return this;
    }
    
    @Override
    public final c5j f(final lxa lxa, final long n) throws IOException {
        final String a = lxa.a;
        this.i();
        this.b.name(a);
        this.i();
        this.b.value(n);
        return this;
    }
    
    public final nle g(Object key) throws IOException {
        if (key == null) {
            this.b.nullValue();
            return this;
        }
        if (key instanceof Number) {
            this.b.value((Number)key);
            return this;
        }
        final boolean array = key.getClass().isArray();
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        if (array) {
            if (key instanceof byte[]) {
                final byte[] array2 = (byte[])key;
                this.i();
                this.b.value(Base64.encodeToString(array2, 2));
                return this;
            }
            this.b.beginArray();
            if (key instanceof int[]) {
                final int[] array3 = (int[])key;
                for (int length = array3.length, j = n5; j < length; ++j) {
                    this.b.value((long)array3[j]);
                }
            }
            else if (key instanceof long[]) {
                final long[] array4 = (long[])key;
                for (int length2 = array4.length, k = n; k < length2; ++k) {
                    final long n6 = array4[k];
                    this.i();
                    this.b.value(n6);
                }
            }
            else if (key instanceof double[]) {
                final double[] array5 = (double[])key;
                for (int length3 = array5.length, l = n2; l < length3; ++l) {
                    this.b.value(array5[l]);
                }
            }
            else if (key instanceof boolean[]) {
                for (boolean[] array6 = (boolean[])key; i < array6.length; ++i) {
                    this.b.value(array6[i]);
                }
            }
            else if (key instanceof Number[]) {
                final Number[] array7 = (Number[])key;
                for (int length4 = array7.length, n7 = n3; n7 < length4; ++n7) {
                    this.g(array7[n7]);
                }
            }
            else {
                final Object[] array8 = (Object[])key;
                for (int length5 = array8.length, n8 = n4; n8 < length5; ++n8) {
                    this.g(array8[n8]);
                }
            }
            this.b.endArray();
            return this;
        }
        else {
            if (key instanceof Collection) {
                final Collection collection = (Collection)key;
                this.b.beginArray();
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    this.g(iterator.next());
                }
                this.b.endArray();
                return this;
            }
            if (key instanceof Map) {
                final Map map = (Map)key;
                this.b.beginObject();
                for (final Map.Entry<Object, V> entry : map.entrySet()) {
                    key = entry.getKey();
                    try {
                        this.h((String)key, entry.getValue());
                        continue;
                    }
                    catch (final ClassCastException ex) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), (Exception)ex);
                    }
                    break;
                }
                this.b.endObject();
                return this;
            }
            final b5j b5j = this.c.get(key.getClass());
            if (b5j != null) {
                this.b.beginObject();
                ((s4a)b5j).a(key, (Object)this);
                this.b.endObject();
                return this;
            }
            final dpw dpw = this.d.get(key.getClass());
            if (dpw != null) {
                ((s4a)dpw).a(key, (Object)this);
                return this;
            }
            if (key instanceof Enum) {
                final String name = ((Enum)key).name();
                this.i();
                this.b.value(name);
                return this;
            }
            final b5j<Object> e = this.e;
            this.b.beginObject();
            ((s4a)e).a(key, (Object)this);
            this.b.endObject();
            return this;
        }
    }
    
    public final nle h(final String s, final Object o) throws IOException {
        if (this.f) {
            nle g;
            if (o == null) {
                g = this;
            }
            else {
                this.i();
                this.b.name(s);
                g = this.g(o);
            }
            return g;
        }
        this.i();
        this.b.name(s);
        nle g2;
        if (o == null) {
            this.b.nullValue();
            g2 = this;
        }
        else {
            g2 = this.g(o);
        }
        return g2;
    }
    
    public final void i() throws IOException {
        if (this.a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
