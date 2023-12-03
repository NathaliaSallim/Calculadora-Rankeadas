    let vitorias = 105;
    let derrotas = 5;
    let saldoRankeadas = vitorias - derrotas;
    let nivel = "";

function calcularNivel(saldo) {
    switch(true) {
        case saldo >= 0 && saldo <= 10:
        return "Ferro";

        case saldo <= 20:
            return "Bronze";
            
        case saldo <= 50:
            return "Prata";
        
        case saldo <= 80:
            return "Ouro";
        
        case saldo <= 90:
            return "Diamante";
            
        case saldo <= 100:
            return "Lendário";
        
        default:
            return "Imortal";   
    }

}
nivel = calcularNivel(saldoRankeadas)
console.log(`O heroi tem um saldo de ${saldoRankeadas} e está no nível de ${nivel}`)