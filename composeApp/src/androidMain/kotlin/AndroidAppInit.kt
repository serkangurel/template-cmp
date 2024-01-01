import org.koin.dsl.KoinAppDeclaration

fun androidAppInit(appDeclaration: KoinAppDeclaration = {}) {
    appInit {
        appDeclaration()
    }
}