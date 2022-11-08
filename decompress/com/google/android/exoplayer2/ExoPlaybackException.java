// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

public final class ExoPlaybackException extends PlaybackException
{
    public final int E0;
    public final String F0;
    public final int G0;
    public final n H0;
    public final int I0;
    public final rxg J0;
    public final boolean K0;
    
    static {
        final cc3 g0 = cc3.G0;
    }
    
    public ExoPlaybackException(final int n, final Throwable t, final int n2, final String s, final int n3, final n n4, final int n5, final boolean b) {
        String b2;
        if (n != 0) {
            if (n != 1) {
                if (n != 3) {
                    b2 = "Unexpected runtime error";
                }
                else {
                    b2 = "Remote error";
                }
            }
            else {
                final String value = String.valueOf(n4);
                final int a = imw.a;
                String s2;
                if (n5 != 0) {
                    if (n5 != 1) {
                        if (n5 != 2) {
                            if (n5 != 3) {
                                if (n5 != 4) {
                                    throw new IllegalStateException();
                                }
                                s2 = "YES";
                            }
                            else {
                                s2 = "NO_EXCEEDS_CAPABILITIES";
                            }
                        }
                        else {
                            s2 = "NO_UNSUPPORTED_DRM";
                        }
                    }
                    else {
                        s2 = "NO_UNSUPPORTED_TYPE";
                    }
                }
                else {
                    s2 = "NO";
                }
                final StringBuilder sb = new StringBuilder(s2.length() + (value.length() + dia.o(s, 53)));
                sb.append(s);
                sb.append(" error, index=");
                sb.append(n3);
                sb.append(", format=");
                b2 = xa0.B(sb, value, ", format_supported=", s2);
            }
        }
        else {
            b2 = "Source error";
        }
        String string = b2;
        if (!TextUtils.isEmpty((CharSequence)null)) {
            final String value2 = String.valueOf(b2);
            final StringBuilder sb2 = new StringBuilder("null".length() + (value2.length() + 2));
            sb2.append(value2);
            sb2.append(": ");
            sb2.append((String)null);
            string = sb2.toString();
        }
        this(string, t, n2, n, s, n3, n4, n5, null, SystemClock.elapsedRealtime(), b);
    }
    
    public ExoPlaybackException(final Bundle bundle) {
        super(bundle);
        this.E0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1001), 2);
        this.F0 = ((BaseBundle)bundle).getString(PlaybackException.a(1002));
        this.G0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1003), -1);
        this.H0 = (n)lt2.c((f$a)n.j1, bundle.getBundle(PlaybackException.a(1004)));
        this.I0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1005), 4);
        this.K0 = bundle.getBoolean(PlaybackException.a(1006), false);
        this.J0 = null;
    }
    
    public ExoPlaybackException(final String s, final Throwable t, final int n, final int e0, final String f0, final int g0, final n h0, final int i0, final rxg j0, final long n2, final boolean k0) {
        super(s, t, n, n2);
        final boolean b = false;
        ri4.k(!k0 || e0 == 1);
        boolean b2 = false;
        Label_0057: {
            if (t == null) {
                b2 = b;
                if (e0 != 3) {
                    break Label_0057;
                }
            }
            b2 = true;
        }
        ri4.k(b2);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public static ExoPlaybackException c(final RuntimeException ex, final int n) {
        return new ExoPlaybackException(2, ex, n, null, -1, null, 4, false);
    }
    
    public final ExoPlaybackException b(final rxg rxg) {
        final String message = ((Throwable)this).getMessage();
        final int a = imw.a;
        return new ExoPlaybackException(message, ((Throwable)this).getCause(), super.C0, this.E0, this.F0, this.G0, this.H0, this.I0, rxg, super.D0, this.K0);
    }
}
