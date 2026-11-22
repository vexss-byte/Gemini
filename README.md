# Lapergods Mod (Fabric 26.3) - Fase 2 (v4 Fixed JDK Dual Setup)

## Fix:
- `Unsupported class file major version 69`: Gradle Daemon dijalankan dengan JDK 21 LTS (agar ASM Groovy script parser Gradle 8.12 berjalan tanpa error), sementara JDK 25 dipasang untuk target kompilasi code Fabric 26.3.
