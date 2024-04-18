document.addEventListener("DOMContentLoaded", function () {
    const botoes = document.querySelectorAll("button[data-arquivo]");
    const texto = document.getElementById("texto");

    botoes.forEach(function (botao) {
        botao.addEventListener("click", function () {
            const nomeArquivo = botao.getAttribute("data-arquivo");
            if (texto.style.display === "none" || texto.style.display === "") {
                const xhr = new XMLHttpRequest();
                xhr.open("GET", nomeArquivo, true);

                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4 && xhr.status === 200) {
                        texto.style.display = "block";
                        texto.innerHTML = xhr.responseText;
                    }
                };

                xhr.send();
            } else {
                texto.style.display = "none";
            }
        });
    });
});
