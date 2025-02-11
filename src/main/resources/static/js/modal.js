document.addEventListener("DOMContentLoaded", function () {
    function abrirModal(botao) {
        const idAluno = botao.getAttribute("data-id");
        const inputDeleteId = document.getElementById("delete-id");

        if (inputDeleteId) {
            inputDeleteId.value = idAluno;  // ✅ Preenche o campo oculto do form de delete
        }

        const modal = document.getElementById("modal-confirmacao");
        if (modal) {
            modal.style.display = "flex";
        }
    }

    function fecharModal() {
        const modal = document.getElementById("modal-confirmacao");
        if (modal) {
            modal.style.display = "none";
        }
    }

    document.getElementById("confirmar-deletar").addEventListener("click", function () {
        const formDelete = document.getElementById("delete-form");
        const inputDeleteId = document.getElementById("delete-id");

        if (formDelete && inputDeleteId.value) {
            formDelete.submit(); // ✅ Envia o formulário apenas se houver um ID
        } else {
            console.error("ID do aluno não encontrado!");
        }
    });

    // Fechar modal ao clicar fora da caixa
    window.onclick = function (event) {
        const modal = document.getElementById("modal-confirmacao");
        if (event.target === modal) {
            fecharModal();
        }
    };

    // Tornar funções acessíveis globalmente
    window.abrirModal = abrirModal;
    window.fecharModal = fecharModal;
});