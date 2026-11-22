# Lapergods Mod (Fabric 26.3) - Fase 2 (v2 Fixed)

## Fitur & Fixes:
- Penggunaan `gradle build` langsung melalui `gradle/actions/setup-gradle@v3` (mengatasi `gradlew` placeholder).
- Sintaks exclusion `upload-artifact@v4` disesuaikan (memakai pattern negative `!build/libs/*-sources.jar` di bawah `path`).
- Registrasi item & block `lapergods:thor_statue`.
- Integrasi `GeoBlockEntity` & `GeoBlockRenderer` GeckoLib 5.5.7.
