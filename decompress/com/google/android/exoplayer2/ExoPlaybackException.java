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
    public final int H0;
    public final String I0;
    public final int J0;
    public final n K0;
    public final int L0;
    public final jyg M0;
    public final boolean N0;
    
    static {
        final lpo h0 = lpo.H0;
    }
    
    public ExoPlaybackException(final int n, final Throwable t, final int n2, final String s, final int n3, final n n4, final int n5, final boolean b) {
        String y;
        if (n != 0) {
            if (n != 1) {
                if (n != 3) {
                    y = "Unexpected runtime error";
                }
                else {
                    y = "Remote error";
                }
            }
            else {
                final String value = String.valueOf(n4);
                final int a = rnw.a;
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
                final StringBuilder sb = new StringBuilder(s2.length() + (value.length() + l58.g(s, 53)));
                sb.append(s);
                sb.append(" error, index=");
                sb.append(n3);
                sb.append(", format=");
                y = wa0.y(sb, value, ", format_supported=", s2);
            }
        }
        else {
            y = "Source error";
        }
        String string = y;
        if (!TextUtils.isEmpty((CharSequence)null)) {
            final String value2 = String.valueOf(y);
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
        this.H0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1001), 2);
        this.I0 = ((BaseBundle)bundle).getString(PlaybackException.a(1002));
        this.J0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1003), -1);
        this.K0 = (n)vt2.c((f$a)n.m1, bundle.getBundle(PlaybackException.a(1004)));
        this.L0 = ((BaseBundle)bundle).getInt(PlaybackException.a(1005), 4);
        this.N0 = bundle.getBoolean(PlaybackException.a(1006), false);
        this.M0 = null;
    }
    
    public ExoPlaybackException(final String s, final Throwable t, final int n, final int h0, final String i0, final int j0, final n k0, final int l0, final jyg m0, final long n2, final boolean n3) {
        super(s, t, n, n2);
        final boolean b = false;
        omi.m(!n3 || h0 == 1);
        boolean b2 = false;
        Label_0057: {
            if (t == null) {
                b2 = b;
                if (h0 != 3) {
                    break Label_0057;
                }
            }
            b2 = true;
        }
        omi.m(b2);
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n3;
    }
    
    public static ExoPlaybackException c(final RuntimeException ex, final int n) {
        return new ExoPlaybackException(2, ex, n, null, -1, null, 4, false);
    }
    
    public final ExoPlaybackException b(final jyg jyg) {
        final String message = ((Throwable)this).getMessage();
        final int a = rnw.a;
        return new ExoPlaybackException(message, ((Throwable)this).getCause(), super.F0, this.H0, this.I0, this.J0, this.K0, this.L0, jyg, super.G0, this.N0);
    }
}
