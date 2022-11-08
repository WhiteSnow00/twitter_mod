// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.util.Collections;
import java.util.Map;
import java.io.IOException;
import android.net.Uri;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import android.content.Context;

public final class c implements a
{
    public final Context a;
    public final List<zxt> b;
    public final a c;
    public FileDataSource d;
    public AssetDataSource e;
    public ContentDataSource f;
    public a g;
    public UdpDataSource h;
    public y78 i;
    public RawResourceDataSource j;
    public a k;
    
    public c(final Context context, final a c) {
        this.a = context.getApplicationContext();
        Objects.requireNonNull(c);
        this.c = c;
        this.b = new ArrayList();
    }
    
    public final long a(final b b) throws IOException {
        final a k = this.k;
        final boolean b2 = true;
        ri4.t(k == null);
        final String scheme = b.a.getScheme();
        final Uri a = b.a;
        final int a2 = imw.a;
        final String scheme2 = a.getScheme();
        int n = b2 ? 1 : 0;
        if (!TextUtils.isEmpty((CharSequence)scheme2)) {
            if ("file".equals(scheme2)) {
                n = (b2 ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        if (n != 0) {
            final String path = b.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    this.p((a)(this.e = new AssetDataSource(this.a)));
                }
                this.k = (a)this.e;
            }
            else {
                if (this.d == null) {
                    this.p((a)(this.d = new FileDataSource()));
                }
                this.k = (a)this.d;
            }
        }
        else if ("asset".equals(scheme)) {
            if (this.e == null) {
                this.p((a)(this.e = new AssetDataSource(this.a)));
            }
            this.k = (a)this.e;
        }
        else if ("content".equals(scheme)) {
            if (this.f == null) {
                this.p((a)(this.f = new ContentDataSource(this.a)));
            }
            this.k = (a)this.f;
        }
        else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    this.p(this.g = (a)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                }
                catch (final Exception ex) {
                    throw new RuntimeException("Error instantiating RTMP extension", ex);
                }
                catch (final ClassNotFoundException ex2) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        }
        else if ("udp".equals(scheme)) {
            if (this.h == null) {
                this.p((a)(this.h = new UdpDataSource()));
            }
            this.k = (a)this.h;
        }
        else if ("data".equals(scheme)) {
            if (this.i == null) {
                this.p((a)(this.i = new y78()));
            }
            this.k = (a)this.i;
        }
        else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.k = this.c;
        }
        else {
            if (this.j == null) {
                this.p((a)(this.j = new RawResourceDataSource(this.a)));
            }
            this.k = (a)this.j;
        }
        return this.k.a(b);
    }
    
    public final int b(final byte[] array, final int n, final int n2) throws IOException {
        final a k = this.k;
        Objects.requireNonNull(k);
        return ((v78)k).b(array, n, n2);
    }
    
    public final void close() throws IOException {
        final a k = this.k;
        if (k != null) {
            try {
                k.close();
            }
            finally {
                this.k = null;
            }
        }
    }
    
    public final Map<String, List<String>> d() {
        final a k = this.k;
        Map<Object, Object> map;
        if (k == null) {
            map = Collections.emptyMap();
        }
        else {
            map = k.d();
        }
        return (Map<String, List<String>>)map;
    }
    
    public final void g(final zxt zxt) {
        Objects.requireNonNull(zxt);
        this.c.g(zxt);
        this.b.add(zxt);
        this.q((a)this.d, zxt);
        this.q((a)this.e, zxt);
        this.q((a)this.f, zxt);
        this.q(this.g, zxt);
        this.q((a)this.h, zxt);
        this.q((a)this.i, zxt);
        this.q((a)this.j, zxt);
    }
    
    public final Uri m() {
        final a k = this.k;
        Uri m;
        if (k == null) {
            m = null;
        }
        else {
            m = k.m();
        }
        return m;
    }
    
    public final void p(final a a) {
        for (int i = 0; i < this.b.size(); ++i) {
            a.g((zxt)this.b.get(i));
        }
    }
    
    public final void q(final a a, final zxt zxt) {
        if (a != null) {
            a.g(zxt);
        }
    }
}
