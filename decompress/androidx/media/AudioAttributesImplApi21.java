// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl
{
    public AudioAttributes a;
    public int b;
    
    public AudioAttributesImplApi21() {
        this.b = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof AudioAttributesImplApi21 && this.a.equals((Object)((AudioAttributesImplApi21)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("AudioAttributesCompat: audioattributes=");
        j.append(this.a);
        return j.toString();
    }
}
