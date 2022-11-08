// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Objects;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import android.content.res.AssetManager;

public final class AssetDataSource extends pk1
{
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;
    
    public AssetDataSource(final Context context) {
        super(false);
        this.e = context.getAssets();
    }
    
    public final long a(final b b) throws AssetDataSource.AssetDataSource$AssetDataSourceException {
        try {
            final Uri a = b.a;
            this.f = a;
            final String path = a.getPath();
            Objects.requireNonNull(path);
            String s;
            if (path.startsWith("/android_asset/")) {
                s = path.substring(15);
            }
            else {
                s = path;
                if (path.startsWith("/")) {
                    s = path.substring(1);
                }
            }
            this.r(b);
            final InputStream open = this.e.open(s, 1);
            this.g = open;
            if (open.skip(b.f) >= b.f) {
                final long g = b.g;
                if (g != -1L) {
                    this.h = g;
                }
                else {
                    final long h = this.g.available();
                    this.h = h;
                    if (h == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                this.s(b);
                return this.h;
            }
            throw new AssetDataSource.AssetDataSource$AssetDataSourceException((Throwable)null, 2008);
        }
        catch (final IOException ex) {
            int n;
            if (ex instanceof FileNotFoundException) {
                n = 2005;
            }
            else {
                n = 2000;
            }
            throw new AssetDataSource.AssetDataSource$AssetDataSourceException((Throwable)ex, n);
        }
        catch (final AssetDataSource.AssetDataSource$AssetDataSourceException ex2) {
            throw ex2;
        }
    }
    
    public final int b(final byte[] array, int read, int n) throws AssetDataSource.AssetDataSource$AssetDataSourceException {
        if (n == 0) {
            return 0;
        }
        final long h = this.h;
        if (h == 0L) {
            return -1;
        }
        Label_0046: {
            if (h == -1L) {
                break Label_0046;
            }
            final long n2 = n;
            try {
                n = (int)Math.min(h, n2);
                final InputStream g = this.g;
                final int a = imw.a;
                read = g.read(array, read, n);
                if (read == -1) {
                    return -1;
                }
                final long h2 = this.h;
                if (h2 != -1L) {
                    this.h = h2 - read;
                }
                this.p(read);
                return read;
            }
            catch (final IOException ex) {
                throw new AssetDataSource.AssetDataSource$AssetDataSourceException((Throwable)ex, 2000);
            }
        }
    }
    
    public final void close() throws AssetDataSource.AssetDataSource$AssetDataSourceException {
        this.f = null;
        try {
            try {
                final InputStream g = this.g;
                if (g != null) {
                    g.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    this.q();
                }
            }
            finally {
                this.g = null;
                if (this.i) {
                    this.i = false;
                    this.q();
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    public final Uri m() {
        return this.f;
    }
}
