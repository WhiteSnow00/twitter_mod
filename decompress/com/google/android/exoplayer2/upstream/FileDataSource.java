// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;
import android.net.Uri;
import java.io.RandomAccessFile;

public final class FileDataSource extends pk1
{
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;
    
    public FileDataSource() {
        super(false);
    }
    
    public final long a(final b b) throws FileDataSource.FileDataSource$FileDataSourceException {
        final Uri a = b.a;
        this.f = a;
        this.r(b);
        int n = 2006;
        try {
            final String path = a.getPath();
            Objects.requireNonNull(path);
            final RandomAccessFile e = new RandomAccessFile(path, "r");
            this.e = e;
            try {
                e.seek(b.f);
                long g;
                if ((g = b.g) == -1L) {
                    g = this.e.length() - b.f;
                }
                this.g = g;
                if (g >= 0L) {
                    this.h = true;
                    this.s(b);
                    return this.g;
                }
                throw new FileDataSource.FileDataSource$FileDataSourceException((String)null, (Throwable)null, 2008);
            }
            catch (final IOException ex) {
                throw new FileDataSource.FileDataSource$FileDataSourceException((Throwable)ex, 2000);
            }
        }
        catch (final RuntimeException ex2) {
            throw new FileDataSource.FileDataSource$FileDataSourceException((Throwable)ex2, 2000);
        }
        catch (final SecurityException ex3) {
            throw new FileDataSource.FileDataSource$FileDataSourceException((Throwable)ex3, 2006);
        }
        catch (final FileNotFoundException ex4) {
            if (TextUtils.isEmpty((CharSequence)a.getQuery()) && TextUtils.isEmpty((CharSequence)a.getFragment())) {
                if (imw.a < 21 || !FileDataSource.FileDataSource$a.a(ex4.getCause())) {
                    n = 2005;
                }
                throw new FileDataSource.FileDataSource$FileDataSourceException((Throwable)ex4, n);
            }
            throw new FileDataSource.FileDataSource$FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", a.getPath(), a.getQuery(), a.getFragment()), (Throwable)ex4, 1004);
        }
    }
    
    public final int b(final byte[] array, int read, final int n) throws FileDataSource.FileDataSource$FileDataSourceException {
        if (n == 0) {
            return 0;
        }
        final long g = this.g;
        if (g == 0L) {
            return -1;
        }
        try {
            final RandomAccessFile e = this.e;
            final int a = imw.a;
            read = e.read(array, read, (int)Math.min(g, n));
            if (read > 0) {
                this.g -= read;
                this.p(read);
            }
            return read;
        }
        catch (final IOException ex) {
            throw new FileDataSource.FileDataSource$FileDataSourceException((Throwable)ex, 2000);
        }
    }
    
    public final void close() throws FileDataSource.FileDataSource$FileDataSourceException {
        this.f = null;
        try {
            try {
                final RandomAccessFile e = this.e;
                if (e != null) {
                    e.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    this.q();
                }
            }
            finally {
                this.e = null;
                if (this.h) {
                    this.h = false;
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
