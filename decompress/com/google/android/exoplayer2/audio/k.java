// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public final class k extends c
{
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;
    
    public k() {
        this.m = rnw.f;
    }
    
    public final ByteBuffer a() {
        if (super.f()) {
            final int n = this.n;
            if (n > 0) {
                this.l(n).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.a();
    }
    
    public final void d(final ByteBuffer byteBuffer) {
        final int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        if (n == 0) {
            return;
        }
        final int min = Math.min(n, this.l);
        this.o += min / super.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        final int n2 = n - min;
        final int n3 = this.n + n2 - this.m.length;
        final ByteBuffer l = this.l(n3);
        final int i = rnw.i(n3, 0, this.n);
        l.put(this.m, 0, i);
        final int j = rnw.i(n3 - i, 0, n2);
        byteBuffer.limit(byteBuffer.position() + j);
        l.put(byteBuffer);
        byteBuffer.limit(limit);
        final int n4 = n2 - j;
        final int n5 = this.n - i;
        this.n = n5;
        final byte[] m = this.m;
        System.arraycopy(m, i, m, 0, n5);
        byteBuffer.get(this.m, this.n, n4);
        this.n += n4;
        l.flip();
    }
    
    public final boolean f() {
        return super.f() && this.n == 0;
    }
    
    public final AudioProcessor$a h(final AudioProcessor$a audioProcessor$a) throws AudioProcessor$UnhandledAudioFormatException {
        if (audioProcessor$a.c == 2) {
            this.k = true;
            AudioProcessor$a e = audioProcessor$a;
            if (this.i == 0) {
                if (this.j != 0) {
                    e = audioProcessor$a;
                }
                else {
                    e = AudioProcessor$a.e;
                }
            }
            return e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
    }
    
    public final void i() {
        if (this.k) {
            this.k = false;
            final int j = this.j;
            final int d = super.b.d;
            this.m = new byte[j * d];
            this.l = this.i * d;
        }
        this.n = 0;
    }
    
    public final void j() {
        if (this.k) {
            final int n = this.n;
            if (n > 0) {
                this.o += n / super.b.d;
            }
            this.n = 0;
        }
    }
    
    public final void k() {
        this.m = rnw.f;
    }
}
