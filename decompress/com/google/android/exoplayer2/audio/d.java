// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.util.Objects;
import java.nio.ByteBuffer;

public final class d extends c
{
    public int[] i;
    public int[] j;
    
    public final void d(final ByteBuffer byteBuffer) {
        final int[] j = this.j;
        Objects.requireNonNull(j);
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final ByteBuffer l = this.l((limit - i) / super.b.d * super.c.d);
        while (i < limit) {
            for (int length = j.length, k = 0; k < length; ++k) {
                l.putShort(byteBuffer.getShort(j[k] * 2 + i));
            }
            i += super.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }
    
    public final AudioProcessor$a h(AudioProcessor$a e) throws AudioProcessor$UnhandledAudioFormatException {
        final int[] i = this.i;
        if (i == null) {
            return AudioProcessor$a.e;
        }
        if (e.c == 2) {
            boolean b;
            if (e.b != i.length) {
                b = true;
            }
            else {
                b = false;
            }
            for (int j = 0; j < i.length; ++j) {
                final int n = i[j];
                if (n >= e.b) {
                    throw new AudioProcessor$UnhandledAudioFormatException(e);
                }
                b |= (n != j);
            }
            if (b) {
                e = new AudioProcessor$a(e.a, i.length, 2);
            }
            else {
                e = AudioProcessor$a.e;
            }
            return e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(e);
    }
    
    public final void i() {
        this.j = this.i;
    }
    
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
