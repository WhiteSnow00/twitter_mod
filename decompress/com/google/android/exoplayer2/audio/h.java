// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public final class h extends c
{
    public final void d(final ByteBuffer byteBuffer) {
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - i;
        final int c = super.b.c;
        int n2 = n;
        int n3 = 0;
        Label_0100: {
            Label_0094: {
                if (c != 3) {
                    if (c != 4) {
                        n3 = n;
                        if (c == 268435456) {
                            break Label_0100;
                        }
                        if (c == 536870912) {
                            n2 = n / 3;
                            break Label_0094;
                        }
                        if (c != 805306368) {
                            throw new IllegalStateException();
                        }
                    }
                    n3 = n / 2;
                    break Label_0100;
                }
            }
            n3 = n2 * 2;
        }
        final ByteBuffer l = this.l(n3);
        final int c2 = super.b.c;
        int j = i;
        if (c2 != 3) {
            int k = i;
            if (c2 != 4) {
                int n4 = i;
                if (c2 != 268435456) {
                    int n5 = i;
                    if (c2 != 536870912) {
                        if (c2 != 805306368) {
                            throw new IllegalStateException();
                        }
                        while (i < limit) {
                            l.put(byteBuffer.get(i + 2));
                            l.put(byteBuffer.get(i + 3));
                            i += 4;
                        }
                    }
                    else {
                        while (n5 < limit) {
                            l.put(byteBuffer.get(n5 + 1));
                            l.put(byteBuffer.get(n5 + 2));
                            n5 += 3;
                        }
                    }
                }
                else {
                    while (n4 < limit) {
                        l.put(byteBuffer.get(n4 + 1));
                        l.put(byteBuffer.get(n4));
                        n4 += 2;
                    }
                }
            }
            else {
                while (k < limit) {
                    final short n6 = (short)(imw.h(byteBuffer.getFloat(k), -1.0f, 1.0f) * 32767.0f);
                    l.put((byte)(n6 & 0xFF));
                    l.put((byte)(n6 >> 8 & 0xFF));
                    k += 4;
                }
            }
        }
        else {
            while (j < limit) {
                l.put((byte)0);
                l.put((byte)((byteBuffer.get(j) & 0xFF) - 128));
                ++j;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l.flip();
    }
    
    public final AudioProcessor$a h(AudioProcessor$a e) throws AudioProcessor$UnhandledAudioFormatException {
        final int c = e.c;
        if (c != 3 && c != 2 && c != 268435456 && c != 536870912 && c != 805306368 && c != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(e);
        }
        if (c != 2) {
            e = new AudioProcessor$a(e.a, e.b, 2);
        }
        else {
            e = AudioProcessor$a.e;
        }
        return e;
    }
}
