// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public final class f extends c
{
    public static final int i;
    
    static {
        i = Float.floatToIntBits(Float.NaN);
    }
    
    public static void m(int n, final ByteBuffer byteBuffer) {
        if ((n = Float.floatToIntBits((float)(n * 4.656612875245797E-10))) == f.i) {
            n = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n);
    }
    
    public final void d(final ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        final int c = super.b.c;
        ByteBuffer byteBuffer2;
        if (c != 536870912) {
            if (c != 805306368) {
                throw new IllegalStateException();
            }
            final ByteBuffer l = this.l(n);
            while (true) {
                byteBuffer2 = l;
                if (position >= limit) {
                    break;
                }
                m((byteBuffer.get(position) & 0xFF) | (byteBuffer.get(position + 1) & 0xFF) << 8 | (byteBuffer.get(position + 2) & 0xFF) << 16 | (byteBuffer.get(position + 3) & 0xFF) << 24, l);
                position += 4;
            }
        }
        else {
            final ByteBuffer i = this.l(n / 3 * 4);
            while (true) {
                byteBuffer2 = i;
                if (position >= limit) {
                    break;
                }
                m((byteBuffer.get(position) & 0xFF) << 8 | (byteBuffer.get(position + 1) & 0xFF) << 16 | (byteBuffer.get(position + 2) & 0xFF) << 24, i);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
    
    public final AudioProcessor$a h(AudioProcessor$a e) throws AudioProcessor$UnhandledAudioFormatException {
        final int c = e.c;
        if (c == 536870912 || c == 805306368 || c == 4) {
            if (c != 4) {
                e = new AudioProcessor$a(e.a, e.b, 4);
            }
            else {
                e = AudioProcessor$a.e;
            }
            return e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(e);
    }
}
